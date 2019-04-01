package pages;


/**
 * Contains sensitive data which should be send in notification.
 */
public class NotificationData {

    private final String key;
    private final String region;
    private final String link;
    private final String site;

    public NotificationData(String key, String region, String link, String site) {
        this.key = key;
        this.region = region;
        this.link = link;
        this.site = site;
    }



    public String getTemplateForNoCVs() {
        return key + " ||| %s ||| " + site + " ||| " + region;
    }

}
