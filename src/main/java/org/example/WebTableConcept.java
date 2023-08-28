package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTableConcept {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        //Task 1: with flight no in flikart need to take rates of it
//        driver.get("https://www.flipkart.com/travel/flights/search?trips=BOM-BKK-30082023&travellers=1-0-0&class=e&tripType=ONE_WAY&isIntl=true&source=Search%20Form");
//        String flight1 = getFlightRate("6E-1051");
//        String flight2 = getFlightRate("SL-219");
//        String flight3 = getFlightRate("UK-123");
//
//        System.out.println(flight1);
//        System.out.println(flight2);
//        System.out.println(flight3);

        //task2: check whether tamil is available in google language

//        driver.get("https://www.google.com/");
//        List<String> allGoogleLang = getGoogleLanguage();
//        System.out.println(allGoogleLang);
//        if (allGoogleLang.contains("தமிழ்")){
//            System.out.println("Google has தமிழ் language");
//        }
//        else {
//            System.out.println("Google does not have தமிழ் language");
//        }

//        //task3:print all info with batsman name and print stats other than bowler name
//        driver.get("https://www.espncricinfo.com/series/afghanistan-in-sri-lanka-aug-2023-2023-1392507/afghanistan-vs-pakistan-2nd-odi-1390345/full-scorecard");
//        List<String> batman1 = getAllInfoOfBatsman("Rahmanullah Gurbaz");
//        List<String> batman2 = getAllInfoOfBatsman("Ibrahim Zadran");
//        System.out.println(batman1);
//        System.out.println(batman2);
//
//        List<String> batman3 = getAllInfoOfBatsmanWithoutBowler("Rahmanullah Gurbaz");
//        List<String> batman4 = getAllInfoOfBatsmanWithoutBowler("Ibrahim Zadran");
//        System.out.println(batman3);
//        System.out.println(batman4);


        driver.get("https://www.google.com/");

        Thread.sleep(4000);
        List<String> allGivenSugesstions = searchName("Narendra Modi");
        Thread.sleep(4000);
        System.out.println(allGivenSugesstions);
        if (allGivenSugesstions.contains("Narendra Modi")){
            System.out.println("given tc is pass");
        }
        else{
            System.out.println("the given tc is fail");
        }
driver.quit();
    }

    //span[contains(text(),'6E-1051')]/ancestor::div[@class='_367J6x']//div[@class='_3Byyvw']
    //span[contains(text(),'6E-1051')]/ancestor::div[@class='_2ikI1T']/following-sibling::div[@class='_8RGto_']
    private static String getFlightRate(String flightNumber) {
        return driver.findElement(By.xpath("//span[contains(text(),'" + flightNumber + "')]/ancestor::div[@class='_2ikI1T']/following-sibling::div[@class='_8RGto_']")).getText();
    }

    private static List<String> getGoogleLanguage() {
        List<WebElement> allLanguages = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
        List<String> allText = new ArrayList<>();
        for (WebElement e : allLanguages) {
            String text = e.getText();
            allText.add(text);
        }
        return allText;
    }

    //a[@title='Rahmanullah Gurbaz']/parent::div/parent::td/following-sibling::td
    private static List<String> getAllInfoOfBatsman(String batsmanName) {
        List<WebElement> allInfo = driver.findElements(By.xpath("//a[@title='" + batsmanName + "']/parent::div/parent::td/following-sibling::td"));
        List<String> allText = new ArrayList<>();
        for (WebElement e : allInfo) {
            String text = e.getText();
            allText.add(text);
        }
        return allText;
    }

    //a[@title='Rahmanullah Gurbaz']/parent::div/parent::td/following-sibling::td[contains(@class,'ds-w-0 ds-whitespace-nowrap')]
    private static List<String> getAllInfoOfBatsmanWithoutBowler(String batsmanName) {
        List<WebElement> allInfo = driver.findElements(By.xpath("//a[@title='"+batsmanName+"']/parent::div/parent::td/following-sibling::td[contains(@class,'ds-w-0 ds-whitespace-nowrap')]"));
        List<String> allText = new ArrayList<>();
        for (WebElement e : allInfo) {
            String text = e.getText();
            allText.add(text);
        }
        return allText;
    }

    private static List<String> searchName(String name){
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(name);
       // List<WebElement> allSuggestions = driver.findElements(By.xpath("//span//b[normalize-space()='salary']/ancestor::div[@class='eIPGRd']/parent::li/parent::ul/li//div[@class='wM6W7d']/span"));
        List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[text()='"+name+"']/ancestor::div[@class='eIPGRd']/parent::li/parent::ul/li//div[@class='wM6W7d']/span"));
        List<String> alltext = new ArrayList<>();

        for (WebElement e:allSuggestions){
            String text = e.getText();
            alltext.add(text);
        }
        return alltext;
    }
}
