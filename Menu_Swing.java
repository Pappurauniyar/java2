import javax.swing.*;
public class Menu_Swing {

    public static void main(String[] args) {
        JFrame f;
        JMenuBar mb;
        JMenu file,edit,help;
        JMenuItem cut,copy,paste,selectAll;

        f = new JFrame();
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("edit");
        help = new JMenu("help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(file);
        edit.add(edit);
        edit.add(help);
        f.add(mb);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
