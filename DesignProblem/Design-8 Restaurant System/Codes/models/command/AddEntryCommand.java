package models.command;

public class AddEntryCommand implements Command {
    // Singleton Instance of DB to interact with
    private Database database;
    private Entry entry;

    public AddEntryCommand(Database db, Entry entry) {
        this.database = db;
        this.entry = entry;
    }

    @Override
    public void execute() {
        database.addEntry(entry);
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }
}
