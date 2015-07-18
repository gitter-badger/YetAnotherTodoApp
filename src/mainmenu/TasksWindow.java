import com.sun.javafx.geom.Rectangle;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class TasksWindow {

	static Stage taskswindow;
	static HBox mainhbox, priorityhbox;
	static VBox leftvbox, rightvbox;
	static TextField  txttitle, txtlocation, txtlabel, txtdue;
	static TextArea txtdescription;
	static Label lbldue, lblreminders, lblpriority;
	static FlowPane panereminders;
	static Button btnsave;
	public static void show(){
		Stage addtaskscenestage = new Stage();
		//Left side	
	txttitle = new TextField("Title");
	txtdescription = new TextArea("Description");
	txtlocation = new TextField("Location");
	txtlabel = new TextField("Label");
	lblpriority = new Label("Priority Level");
	ChoiceBox<String> cbpriority = new ChoiceBox<>();
	cbpriority.getItems().addAll("High", "Medium", "Low");
	cbpriority.setValue("Medium");
	btnsave = new Button("Save Task");
	leftvbox = new VBox();
	priorityhbox = new HBox(lblpriority, cbpriority);
	
	btnsave.setOnAction(e-> {
		//RUN CODE TO SAVE DATA TO DATABASE
		addtaskscenestage.close();
		
		
	});
	
	priorityhbox.setSpacing(20);
	leftvbox.getChildren().addAll(txttitle, txtdescription,txtlocation, txtlabel, priorityhbox);	
	leftvbox.setPadding(new Insets(20));
	leftvbox.setSpacing(20);
	
	
	//right side
	lbldue = new Label("Due");
	txtdue = new TextField("dd/mm/yyyy");
	lblreminders = new Label("Reminders");
	panereminders = new FlowPane(); // Empty pane where the reminders will be added
	rightvbox = new VBox();
	
	
	rightvbox.getChildren().addAll(lbldue, txtdue, lblreminders, panereminders, btnsave);
	rightvbox.setPadding(new Insets(20));
	rightvbox.setSpacing(20);
	//Main
	mainhbox = new HBox(leftvbox, rightvbox);
	
	
	Scene addtaskscene = new Scene(mainhbox, 500, 400);
	
	addtaskscenestage.initModality(Modality.APPLICATION_MODAL);
	addtaskscenestage.setResizable(false);
	addtaskscenestage.setScene(addtaskscene);
	addtaskscenestage.setTitle("Add Task");
	addtaskscenestage.initStyle(StageStyle.UTILITY);
	addtaskscenestage.showAndWait();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
