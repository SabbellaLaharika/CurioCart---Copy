package cosmetics;

import javax.swing.JLabel;

import codes.ProductDetailsFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreamsAndLotionsFrame extends ProductDetailsFrame implements ActionListener{
    public CreamsAndLotionsFrame(String[] images, String[] brands, String[] prices, String[] features, String heading,JLabel blankSpaceLabel,String title,String tableName) {
        super(images,brands,prices,features,heading,blankSpaceLabel,title,tableName);
        backButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == backButton)
        {
            new CosmeticsAndJewellaryFrame();
        }
    }
}