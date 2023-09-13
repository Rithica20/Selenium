package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCombinationsOfXpath {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        //Xpath: address of the element in HTML DOM

//         absolute xpath: locates from the root element to desired element
//         syntax /tagname[@attrname='attrivalue']
//         /html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input : search box of flipkart

//         relative xpath: locates the desired element directly
//         syntax //tagname[@attrname='attrivalue']
//         //input[@title='Search for products, brands and more'] : search box of flipkart

//         using and or  to combine attributes
//         //img[@class='_396cs4' and @alt='Home & Furniture'] :Home and furniture section tab in flipkart
//        //img[@alt='Flipkart' or @title='Flipkart' or @class='_2xm1JU'] :flipkart text before search box
//        in the above xpath it will match if either one attribute value is matching

            //div[@class='field nocaptcha form-group--no-label']//valid :https://www.orangehrm.com/en/book-a-free-demo/
//          here we have two classname we can identify with space
//          By name = By.class("field nocaptcha form-group--no-label");  //invalid
//          This will aslo throw exception
//         //By classname : InvalidSelectorException: Compound class names not permitted
//        //By xpath and using class attr : you have to pass the full class name.

//        One more eg from  code
//         //By e1 = By.xpath("//input[@class='form-control private-form__control login-email']");//valid
//        //By e2 = By.className("login-email");//valid
//        //By e3 = By.className("form-control private-form__control login-email");//not valid
//
//        By e4 = By.xpath("//input[contains(@class,'login-email')]");//valid
//        By e5 = By.xpath("//input[@class='login-email']");//not valid
//
//        Contains function
//        Syntax: //tagname[contains(@attrname,'attrvalue')]
//        //input[contains(@placeholder,'E-Mail')] :https://naveenautomationlabs.com/opencart/index.php?route=account/login
//        //input[contains(@id,'Form_getForm')]:12---->https://www.orangehrm.com/en/book-a-free-demo/
///
//         One more example from
//          //long value:
//        //dynamic attributes/ids:
//    		<input id = "test_123">
//          <input id = "test_456">
//    		<input id = "test_900">
        //input[contains(@id,'test_')]
        //h2[contains(@class,'heading-text')]:globallogic.com
//
//          //contains() with attr1 and attr2 without contains:
            //input[contains(@id,'Form_getForm') and @placeholder='Phone Number*'] :https://www.orangehrm.com/en/book-a-free-demo/
//          //input[contains(@name,'action_') and @value='Get a Free Demo'] :https://www.orangehrm.com/en/book-a-free-demo/
//
//
//          Text function
//          Syntax://tagname[text()='value']
//          //span//label[text()='Books']  :zoho.com
//          //small[text()='Powerful financial platform for growing businesses.']  :zoho.com
//          //select[@id='Form_getForm_Country']/option[normalize-space()='Andorra'] :is to remove space in text -->orangehrm.com
//
//          contains text function:
//         //contains() with text():
//        //tagname[contains(text(),'value')]
//        //span[contains(text(),'60,000+ businesses of all sizes')] //freshworks.com
//        //a[contains(text(),'Zoho.com')]:zoho.com
//
//          //text() with @attr:
//          //h3[contains(@class,'services_home_1') and text()='Automotive']
//          //label[text()='First Name' and @for='input-firstname'] :https://naveenautomationlabs.com/opencart/index.php?route=account/register
//
//          //text() with contains and attr1 with contains() and attr2 without contains:
//          //label[text()='First Name' and contains(@class,'col-sm-2') and @for='input-firstname'] :https://naveenautomationlabs.com/opencart/index.php?route=account/register
//
//          //index/position in xpath:
//
//          (//input[@class='form-control'])[1]:navenautomation
//          (//input[@class='form-control']) [position()=1] :1st element
//          (//input[@class='form-control']) [last()] :last element
//          (//input[@class='form-control']) [last()-1] :last before element
//          (//input[@class='form-control']) [last()=(last()-1)]  :1st element ////////
//
//          ((//div[@class='_2NKhZn _1U1qnR'])[last()]//p)[last()] :flipkart last element telephone
//          ((//div[@class='_2NKhZn _1U1qnR'])[last()]//p)[last()-1] // capture group we were adding this() for adding index we call it as capture group

        //parent to child:
        //parent/child: direct child
        //parent//child: direct + indirect child
//
//       parent/child: direct child
//      //div[@class='_2Brcj4'][last()]/a :facebook word in flipkart homepage
//      //parent//child: direct + indirect child
//      //div[@class='_1LJS6T']//p :flipkart homepage
//
//      //child to parent
//      //backward traversing in xpath: child we use /..
//      //a[text()='Corporate Information']/../../../../..   --> This was pointing from corporate information to footer class in flipkart homepage
//          using parent:: here -->for immediate parent tag
//      //a[text()='Corporate Information']/parent::div/parent::div/parent::div/parent::div/parent::footer
//
//      //using ancestor here:: --> this for not an immediate parent that is grandparent great grandparent
//      //a[text()='Corporate Information']/ancestor::footer --> This was pointing from corporate information to footer class in flipkart homepage
//      //a[text()='Corporate Information']/ancestor::html
//      //a[text()='Corporate Information']/ancestor::div[@class='_3rc_xQ']
//
//      //Using both ancestor and parent
//      //a[text()='Corporate Information']/ancestor::div[@class='_3rc_xQ']/parent::footer
//
//
//
//
//
//      FROM https://www.makemytrip.com/
//
//      /html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input
//      //div//input[@aria-autocomplete='list']
//      //span[@class='chNavIcon appendBottom2 chSprite chFlights active']
//      //input[@data-cy='toCity' and @type='text']
//      (//input[contains(@class,'lineHeight36') and @type='text'])[last()-1]
//      //span[contains(@class,'font12') and text()='Trending Searches:']
//      //div[contains(text(),'INTL') and @data-cy='superOfferLobLabel0']
//      //p[contains(text(),'BIG Announcement:') and @data-cy='superOfferPtl0' and contains(@class,'blackText')]
//      (//div[contains(text(),'INTL')])[last()]
//      (//div[contains(text(),'INTL')])[last()-1]
//      (//div[contains(text(),'INTL')])[last()-(last()-1)]
//      (//div[contains(text(),'INTL')])[position()=5]
//      //p[@class='font12 latoBold categTitle appendBottom5']/div[text()='INTL FLIGHTS' and @data-cy='superOfferLobLabel0']
//      //p[contains(text(),'Book domestic')]/parent::div/parent::div/ancestor::main
//      //a[text()='UAE']/parent::span/parent::p/ancestor::footer
//
//
//      // absolute xpath
//        /html/head/script

        //copied xpath from browser
        //*[@id="navFooter"]/div[1]/div/div[1]
//
//      Relative xpath
//      //input[@placeholder='Search Amazon']

//        using and or operator
//        //span[@class='nav-line-2 'and text()='Account & Lists']
//
//
//      using multiple class names
//        //a[@class='nav-a nav-a-2   nav-progressive-attribute']
//
//          //div[@id='nav-xshop']/a[@data-csa-c-slot-id='nav_cs_0']
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
        //
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

    }
}
