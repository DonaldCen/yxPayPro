package org.yx.db;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yx.db.dao.LitemallSystemMapper;
import org.yx.db.domain.LitemallSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MapperReturnTest {

    @Autowired
    private LitemallSystemMapper systemMapper;

    @Test
    public void test() {
        LitemallSystem system = new LitemallSystem();
        system.setKeyName("test-system-key");
        system.setKeyValue("test-system-value");
        int updates = systemMapper.insertSelective(system);
        Assert.assertEquals(updates, 1);

        updates = systemMapper.deleteByPrimaryKey(system.getId());
        Assert.assertEquals(updates, 1);

        updates = systemMapper.updateByPrimaryKey(system);
        Assert.assertEquals(updates, 0);
    }

}

