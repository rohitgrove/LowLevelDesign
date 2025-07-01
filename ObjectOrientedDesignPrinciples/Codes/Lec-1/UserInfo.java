public class UserInfo {
    public void addUser(String name) {
        // user add code
    }

    public void deleteUser(String name) {
        // user add code
    }
}

class Logger {
    public void logError(String err) {
        // log error
    }
}

class ContentManager {
    public void addContent(String contentID, String content) {
        // db add
    }

    public void removeContent(String contentID, String content) {
        // db delete
    }

    public String getContent(String contentID) {
        // get from db
        return "Actual content";
    }
}

class ContentRenderer {
    public String renderAsHTML(String contentID) {
        ContentManager c = new ContentManager();
        String content = c.getContent(contentID);
        // html banane ki processing
        String html = "html string";
        return html;
    }
}
