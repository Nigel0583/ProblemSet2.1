import javax.swing.*;

public class MyFlicks {
    public static void main(String[] args) {

        Film[] catalogs = new Film[0];
        String text = "";

        while (!text.equals("N")) {

            text = JOptionPane.showInputDialog("Do you want to create a catalog of films (Y/N)");
            text = text.toUpperCase();

            if (!text.equals("N"))
            {
                Film catalog = new Film();


                catalog.setDirector(JOptionPane.showInputDialog("Please enter the name of the film:"));

                catalog.setTitle(JOptionPane.showInputDialog("Please enter the name of the director:"));

                catalog.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the film:")));

                catalogs = Film.addToCatalog(catalogs , catalog);
            }

                Film.display(catalogs);

        }

    }
}
