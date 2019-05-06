package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.function.Function;
import java.util.function.Supplier;

public class Controller {
    public TextField kvadratText;
    public TextField naPrvuText;
    public TextField brojText;
    public TextField x1Text;
    public TextField x2Text;

    public void calculateBtnAction(ActionEvent actionEvent) {
        Double a=Double.parseDouble(kvadratText.getText());
        Double b=Double.parseDouble(naPrvuText.getText());
        Double c=Double.parseDouble(brojText.getText());

      Supplier<String> f= ()->{
            Double d=b*b-4*a*c;
            String result="";
            if(d<0){
                d=-d;
                Double x1Real=-b/2*a;
                Double x1Imag=Math.sqrt(d)/2*a;
                result=x1Imag+"+"+x1Imag+"i";
            }
            else {
                Double x1 = (-b +Math.sqrt(d)/2*a)/2;
                result=x1+"";

            }
            x1Text.setText(result);
            return result;
        };
        x1Text.setText(f.get());

        Supplier<String> f1= ()->{
            Double d=b*b-4*a*c;
            String result="";
            if(d<0){
                d=-d;
                Double x1Real=-b/2*a;
                Double x1Imag=-Math.sqrt(d)/2*a;
                result=x1Imag+"+"+x1Imag+"i";
            }
            else {
                Double x1 = (-b -Math.sqrt(d)/2*a)/2;
                result=x1+"";

            }
            x1Text.setText(result);
            return result;
        };
        x2Text.setText(f1.get());

    }
}
