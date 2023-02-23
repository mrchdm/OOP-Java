package Controller;

import Config.LoggerConfig;
import Model.RationalExample;
import Service.Solve;
import Service.impl.SolveIpml;
import View.MenuGet;
import View.MenuShow;
import View.impl.MenuGetImpl;
import View.impl.MenuShowImpl;

import java.io.IOException;


public class Calculate {
    public Solve solve = new SolveIpml();

    public void start() {
        MenuGet menuGet = new MenuGetImpl();
        MenuShow menuShow = new MenuShowImpl();
        try {
            LoggerConfig.config();
        } catch (IOException e) {
            menuShow.showMessage("Error", "Problem with logging");
        }

        String action;
        do {
            action = menuShow.showMenu(menuGet);
            if (action.equals("0")) {
                return;
            }
            RationalExample example = new RationalExample(solve.checkOperation(action));
            Number[] values = menuGet.getValuesForExpression();
            example.setVariableA(values[0]);
            example.setVariableB(values[1]);
            try {
                menuShow.showMessage("Result", solve.solve(example));
            } catch (NullPointerException e) {
                menuShow.showMessage("Error", "Incorrect data. Please, input values again");
            }
        } while (true);
    }
}