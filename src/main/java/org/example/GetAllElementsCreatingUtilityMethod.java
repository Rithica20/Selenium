package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GetAllElementsCreatingUtilityMethod {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        By allimg = By.tagName("img");
        ElementUtil eu = new ElementUtil(driver);

        List<WebElement> totalImgList = eu.getElements(allimg);
        System.out.println("total size of image is::"+eu.getSize(allimg));
        List<String> allimgtext = eu.getElementsImgList(allimg, "src");
        System.out.println(allimgtext);
//        List<WebElement> totalImgList = driver.findElements(allimg);
//
//        int totalSize = totalImgList.size();
//        System.out.println("total size of image is::"+totalSize);
//
//        for (WebElement e:totalImgList) {
//           String attrValue = e.getAttribute("src");
//           if (!attrValue.isEmpty()){
//               System.out.println(attrValue);
//           }
        }
//
//    private static List<WebElement> getElements(By locator){
//
//        return driver.findElements(locator);
//    }
//    private static int getSize(By locator){
//
//        return getElements(locator).size();
//    }
//    private static List<String> getElementsImgList(By locator, String value){
//        List<WebElement> allImg = getElements(locator);
//        List<String> allImgLinks = new ArrayList<>();
//        for (WebElement e:allImg) {
//           String allAttrValue = e.getAttribute(value);
//            if (!allAttrValue.isEmpty()){
//                allImgLinks.add(allAttrValue);
//            }
//        }
//        return allImgLinks;
//    }









//        By allLinks = By.tagName("a");
//        System.out.println("total links present:: "+getLinksCount(allLinks));
////        System.out.println("total count of links is::"+totalSize);
//        List<String> totalLinkText = getElementsTextList(allLinks);
//        System.out.println(totalLinkText);
//    }
//    private static List<WebElement> getElements(By locator){
//       return driver.findElements(locator);
//    }
//    private static int getLinksCount(By locator){
//       return getElements(locator).size();
//    }
//    private static List<String> getElementsTextList(By locator){
//        List<WebElement> totalList = getElements(locator);
//        List<String> linkListText = new ArrayList<>();
//        for (WebElement e:totalList) {
//            String linkText = e.getText();
//            if (!linkText.isEmpty()){
//                linkListText.add(linkText);
//            }
//        }
//        return linkListText;

}
