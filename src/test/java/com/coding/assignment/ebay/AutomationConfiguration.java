package com.coding.assignment.ebay;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/*
 * This is to let application know about the required packages to scan
 */

@ComponentScan({"com.coding.assignment.ebay"})
@EnableAutoConfiguration
public class AutomationConfiguration {}
