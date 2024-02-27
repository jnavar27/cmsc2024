


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMainPane extends VBox 
{
	private DataManager dataManager;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Label label;
	private TextField textField;
	private HBox hbox1;
	private HBox hbox2;
	FXMainPane() 
	{
		dataManager = new DataManager();
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		
		label = new Label("Feedback: ");
		textField = new TextField();
		
		hbox1 = new HBox();
		hbox2 = new HBox();
		
		class ButtonHandler implements EventHandler<ActionEvent> 
		{
            public void handle(ActionEvent event) 
            {
                if (event.getTarget() instanceof Button) 
                {
                    Button button = (Button) event.getTarget();
                    String buttonText = button.getText();
                    if (buttonText.equals("Hello") || buttonText.equals("Howdy") || buttonText.equals("Chinese")) 
                    {
                        String response = "";
                        if (buttonText.equals("Hello")) 
                        {
                            response = dataManager.getHello();
                        } else if (buttonText.equals("Howdy")) 
                        {
                            response = dataManager.getHowdy();
                        } else if (buttonText.equals("Chinese")) 
                        {
                            response = dataManager.getChinese();
                        }
                        textField.setText(response);
                    } else if (buttonText.equals("Clear")) 
                    {
                        textField.setText("");
                    } else if (buttonText.equals("Exit")) 
                    {
                        Platform.exit();
                        System.exit(0);
                    }
                }
            }
        }
        button1.setOnAction(new ButtonHandler());
        button2.setOnAction(new ButtonHandler());
        button3.setOnAction(new ButtonHandler());
        button4.setOnAction(new ButtonHandler());
        button5.setOnAction(new ButtonHandler());
		hbox1.getChildren().addAll(button1, button2, button3, button4, button5);
		hbox2.getChildren().addAll(label, textField);
		getChildren().addAll(hbox1, hbox2);
		setAlignment(Pos.CENTER);
        setSpacing(20);
        setPadding(new Insets(20));
        hbox1.setAlignment(Pos.CENTER);
        hbox1.setSpacing(10);
        hbox2.setAlignment(Pos.CENTER);
        hbox2.setSpacing(10);
	}
}
	
