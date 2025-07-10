public interface UIComponent {
    public void draw();

    public void add(UIComponent component);

    public void remove(UIComponent component);
}