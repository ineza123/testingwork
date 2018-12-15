/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packageBk;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class bk_testing_webpage {
    
    public static void main(String[] args) {
        System.getProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-server-standalone\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        
          driver.get("https://www.bk.rw");
        WebElement link, table;
        //link =driver.findElement(By.linkText("personal"));
       
        
        // On top navigation Under open account section, click on"Personal account link
        driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal/checking-saving/personal-current']")).click();    
        driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']")).click();
        Float buyingPrice=Float.parseFloat(driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[2]")).getText());
        Float sellingPrice=Float.parseFloat(driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[3]")).getText());
        if((sellingPrice>=800) && (sellingPrice>buyingPrice)){
            table=driver.findElement(By.xpath("//a[@href='https://www.bk.rw/online-services/apply-for-online-banking' and @class='btn btn-primary more-btn']"));
            actions.moveToElement(table);
            actions.perform();
            table.isSelected();
        } else {
        }
        
        
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div/div[2]/ul[1]/li[2]/a")).click();
         
        //Click on online banking link under current  & saving menu 
        driver.findElement(By.xpath("//a[@href='https://www.bk.rw/ways-of-banking/online-banking']")).click();
        
        //get a link for "Apply now button"
        link=driver.findElement(By.xpath("//a[@href='https://www.bk.rw/online-services/apply-for-online-banking' and @class='btn btn-primary more-btn']"));
        Actions //<editor-fold defaultstate="collapsed" desc="/*comment*/">
                moveToElement
//</editor-fold>
;
        moveToElement = actions.moveToElement(link);
        actions.perform();
        link.click();
  

      
        try{
            Thread.sleep(5000);
            
        }catch(InterruptedException ex){               
     
 
            Logger.getLogger(bk_testing_webpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
        driver.close();
    }
}