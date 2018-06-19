package com.coding.assignment.ebay.steps;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coding.assignment.ebay.AutomationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutomationConfiguration.class, loader = SpringBootContextLoader.class)
@SpringBootTest
public class BaseSteps {
}
