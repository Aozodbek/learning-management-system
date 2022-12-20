import com.example.firstguiapp.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class NotificationView {
    public void btnNotifcationOnAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NotificationView.fxml"));

    }
}
