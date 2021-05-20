package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MailDelete {

    public static void main(String[] args) {

        Driver.getDriver().get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

        ReusableMethods.sleep(3000);

        WebElement mailBox = Driver.getDriver().findElement(By.id("identifierId"));
        mailBox.sendKeys("iduzel49@gmail.com");


    }




}
