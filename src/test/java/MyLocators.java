import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyLocators {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By DISCOVER_CARS_IMG = By.xpath(".//img[@src = 'https://www.discovercars.com/assets/desktop/img/svg/discovercars-blue.svg']");
    private final By LOGIN_ICON = By.className("navigation-link action my-booking trigger-login-modal pointer");

    private final By EUR_ICON = By.id("document");
    private final By NO_HIDDEN_COSTS = By.className("home-caption");

    private final By PICK_DATE = By.className("date-field trigger-gtm-sb hasDatepicker");

    private final By SEARCH_NOW_BTN = By.className("button button-green button-lg submit prevent-loading trigger-gtm-sb gtm-track-fix");
    private final By RIGHT_SIGN = By.xpath("//svg[@viewBox = '0 0 24 24']");
    private final By RIGHT_BOX = By.className("tp-widget-review");
    private final By WE_COMPARE_CAR_RENTAL = By.xpath(".//h2[@ = 'Wle compare car rental prices, you save!']");
    private final By SPECIAL_OFFERS = By.className("grouped opened");
    private final By SMALL_CARS = By.className("car-top-filter-item car-groups-item filtering-event init");
    private final By NEXT_TO_THE_RIGHT = By.className("car-top-filter-control next");
    private final By SHOWING_CARS  = By.className("showing-cars");
    private final By ONE_BAG = By.xpath(".//span[@ = '1 bag']");
    private final By PRICE = By.xpath(".//a[@class = 'dc-ui dropdown-toggle text-blue-500']");
    private final By RENTAL_CONDITIONS = By.xpath(".//div[@class = 'rc-link']");
    private final By VIEW = By.xpath(".//a[@class = 'btn btn-book submit click-on-car selected-car prevent-loading instant']");

    private final By CAR_SPECIFICATIONS_PRICE = By.xpath(".//span[@class = 'min-price']");
    private final By GASOLINE = By.xpath(".//label[@data-event-label = 'Gasoline']");
    private final By RENTAL_CONDITIONS_TWO = By.xpath(".//a[@class = 'open-modal search-index trigger-gtm-rc rental-conditions with-logo']");
    private final By PARTIAL_PAYMENT = By.xpath(".//span[@class = 'dc-ui badge badge-medium badge-blue']");
    private final By FOUR_SEATS = By.xpath(".//label[@class = 'filter-number-of-seats my-checkbox-label default filtering-event']");
    private final By SUPLIER_RATING = By.xpath(".//div[@class = 'supplier-rating']");
    private final By PRICE_ITEM = By.xpath(".//div[@class = 'price-item-price-main']");

    public void findNeededElements() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();
        browser.findElement(DISCOVER_CARS_IMG);
        browser.findElement(EUR_ICON);
        browser.findElement(LOGIN_ICON);
        browser.findElement(NO_HIDDEN_COSTS);
        browser.findElement(PICK_DATE);

        browser.findElement(SEARCH_NOW_BTN);
        browser.findElement(RIGHT_SIGN);
        browser.findElement(RIGHT_BOX);
        browser.findElement(WE_COMPARE_CAR_RENTAL);
        browser.findElement(SPECIAL_OFFERS);
        browser.findElement(SMALL_CARS);
        browser.findElement(NEXT_TO_THE_RIGHT);
        browser.findElement(SHOWING_CARS);
        browser.findElement(ONE_BAG);
        browser.findElement(PRICE);
        browser.findElement(RENTAL_CONDITIONS);
        browser.findElement(VIEW);
        browser.findElement(CAR_SPECIFICATIONS_PRICE);
        browser.findElement(GASOLINE);
        browser.findElement(RENTAL_CONDITIONS_TWO);
        browser.findElement(PARTIAL_PAYMENT);
        browser.findElement(FOUR_SEATS);
        browser.findElement(SUPLIER_RATING);
        browser.findElement(PRICE_ITEM);



    }
}



