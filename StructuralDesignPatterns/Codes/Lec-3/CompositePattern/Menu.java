import java.util.ArrayList;
import java.util.List;

public class Menu implements UIComponenet {
    // menu k andar bhut saare parts ho sacte hai
    // iske andar ke saare parts ko main -> khe rha hu
    List<UIComponenet> children = new ArrayList<>();

    @Override
    public void draw() {
        for (UIComponenet uiComponenet : children) {
            uiComponenet.draw();
        }
    }

    @Override
    public void add(UIComponenet componenet) {
        children.add(componenet);
    }

    @Override
    public void remove(UIComponenet componenet) {
        children.remove(componenet);
    }
}
