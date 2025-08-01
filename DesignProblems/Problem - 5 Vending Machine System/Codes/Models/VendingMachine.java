package Models;

import java.util.List;

public class VendingMachine {

    private NoMoneyInsertedState noMoneyState = new NoMoneyInsertedState(this);
    private MoneyInsertedState moneyState = new MoneyInsertedState(this);
    private DispenseProductState dispenseProductState = new DispenseProductState(this);
    private IState state;
    private List<Slot> slots;
    private List<Slot> availableSlots;
    private int collectedCash;
    private List<Admin> operators;
    private List<Product> productList;

    private static VendingMachine machineInstance = null;

    private VendingMachine() {
    }

    public static VendingMachine getInstance() {
        if (machineInstance == null) {
            machineInstance = new VendingMachine();
        }
        return machineInstance;
    }

    public void setState(IState newState) {
        state = newState;
    }

    public NoMoneyInsertedState getNoMoneyInsertedState() {
        return noMoneyState;
    }

    public MoneyInsertedState getMoneyInsertedState() {
        return moneyState;
    }

    public DispenseProductState getDispenseProductState() {
        return dispenseProductState;
    }

    public void selectProduct(int slotNumber) {

    }

    public void insertMoney(double amount) {

    }

    public void pressButton(int slotNumber) {

    }

    public void updateInventory(int slotNumber) {

    }

    public void dispenseProduct(int slotNumber) {

    }

    public void returnChange(double amount) {

    }

    public void showErrorMsg() {
    }

    public void addAdmin(Admin user) {
    }

    public void removeAdmin(Admin user) {
    }

    public NoMoneyInsertedState getNoMoneyState() {
        return this.noMoneyState;
    }

    public void setNoMoneyState(NoMoneyInsertedState noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public MoneyInsertedState getMoneyState() {
        return this.moneyState;
    }

    public void setMoneyState(MoneyInsertedState moneyState) {
        this.moneyState = moneyState;
    }
    public void setDispenseProductState(DispenseProductState dispenseProductState) {
        this.dispenseProductState = dispenseProductState;
    }

    public IState getState() {
        return this.state;
    }


    public List<Slot> getSlots() {
        return this.slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public List<Slot> getAvailableSlots() {
        return this.availableSlots;
    }

    public void setAvailableSlots(List<Slot> availableSlots) {
        this.availableSlots = availableSlots;
    }

    public int getCollectedCash() {
        return this.collectedCash;
    }

    public void setCollectedCash(int collectedCash) {
        this.collectedCash = collectedCash;
    }

    public List<Admin> getOperators() {
        return this.operators;
    }

    public void setOperators(List<Admin> operators) {
        this.operators = operators;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void validateAdmin(Admin user) {
    }

    public void openCashDispenser() {
    }

    public void searchProduct(Product item) {
    }
}
