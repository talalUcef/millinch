package com.millinch.common.dao.jpa;

import com.millinch.common.po.SysBranch;
import com.millinch.common.po.SysUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.*;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:conf/common-context.xml", "classpath:conf/jpa-context.xml"})
@ActiveProfiles("development")
public class SysUserRepositoryTest {

    @Autowired private SysUserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        Assert.notNull(userRepository, "SysUserRepository is null !!!");
    }

    @Test
    public void testSave(){
        SysBranch branch = new SysBranch();
        branch.setId(0L);
        SysUser user = new SysUser();
        user.setUserName("robot" + System.nanoTime());
        user.setPassword("pwd" + System.nanoTime());
        user.setSalt("salt" + System.currentTimeMillis());
        user.setEmail(System.currentTimeMillis() + "@millinch.com");
        user.setAvatar("http://www.millinch.com/avator/default.png");
        user.setBranch(branch);
        user.setStatus("USER_STATUS.USING");
        user.setCreator("system");
        user.setCorrector("system");
        userRepository.save(user);
    }

    @Test
    public void testUpdate(){
        SysUser user = userRepository.findOne(0L);
        Assert.notNull(user, "Didn't find any user");
        user.setPassword("pwd" + System.nanoTime());
        //user.setUpdateTime(null);
        userRepository.save(user);
    }

    @Test
    public void testFindAll(){
        Iterable<SysUser> all = userRepository.findAll();
        for (SysUser sysUser : all) {
            System.out.println(sysUser);
        }
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("SysUserRepositoryTest done.");
    }
}