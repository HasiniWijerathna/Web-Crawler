public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.search("https://www.amazon.com/Samsung-Galaxy-S7-Smartphone-International/dp/B01CJSF8IO", "computer");
    }
}