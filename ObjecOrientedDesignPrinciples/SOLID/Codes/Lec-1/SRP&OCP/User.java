class UserInfo {
    public void addUser(String name) {
        // user add code
    }
}

class Logger {
    public void logError(String err) {
        // log error
    }
}

// SRP example 2
class ContentManager {
    public void addContent(String contentID, String content) {
        // db add
    }

    public void removeContent(String contentID, String content) {
        // db delete
    }

    public String getContent(String contentID) {
        // get from DB
        return "Actual Content";
    }
}

class ContentRender {
    public String renderContentAsHTML(String content) {
        ContentManager c = new ContentManager();
        content = c.getContent(content);
        // html banane ki processing
        String html = "html string";
        return html;
    }
}