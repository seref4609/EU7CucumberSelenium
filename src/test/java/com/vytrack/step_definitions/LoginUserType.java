package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginUserType {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String usertype) {
        String username = "";
        String password = "";

        switch (usertype) {
            case "storeManager":
                username = ConfigurationReader.get("storemanager_username");
                password = ConfigurationReader.get("storemanager_password");
                break;
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "salesManager":
                username = ConfigurationReader.get("salesmanager_username");
                password = ConfigurationReader.get("salesmanager_password");
                break;

            default:
                System.out.println("UNKNOWN USER TYPE!!!");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);


    }
}

