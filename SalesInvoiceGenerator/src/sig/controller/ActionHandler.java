package sig.controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;

public class ActionHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Handling Called! ");
        switch (e.getActionCommand()) 
        {
            case "New Invoice":
                System.out.println("New Invoice");
                newInv();
                break ;
            case "Delete Invoice":
                System.out.println("Delete Invoice");
                deleteInv();
                break ;
            case "Save":
                System.out.println("Save");
                saveItem();
                break ;
            case "Cancel":
                System.out.println("Cancel");
                cancelItem();
                break;
        }
    }

    private void newInv() {
        JFileChooser fc = new JFileChooser();
            int result;
        result = fc.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION)
            {
                String path = fc.getSelectedFile().getPath();
                FileInputStream fis = null ;
                try{
                fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                ta.setText(new String(b));}
                catch (FileNotFoundException e)
                {}catch(IOException e)
                {}
                finally {
                    try {
                    fis.close();}
                    catch(IOException e){}
                }

            }
    }

    private void deleteInv() {
    }

    private void cancelItem() {
    }

    private void saveItem() {
    }
    
}
