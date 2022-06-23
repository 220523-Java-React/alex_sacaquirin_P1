import Controller.CarController;
import Controller.OfferController;
import Controller.UserController;
import io.javalin.Javalin;
import io.javalin.core.security.RouteRole;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {
    Logger logger = LoggerFactory.getLogger(Driver.class);

    public static void main(String[] args) {
        CarController carController = new CarController();
        UserController userController = new UserController();
        OfferController offerController = new OfferController();

        Javalin app = Javalin.create().start(8080);
            app.get("/", ctx-> ctx.result("Alchemy Car Shop"));
            app.post("/",ctx -> ctx.result("Welcome to the CarApi"));

            app.get("/cars", (Handler) carController.getAllCars);
            app.post("/cars", (Handler) carController.createNewCar);

            app.get("/offers",(Handler) offerController.getAllOffers);
            app.post("/offers",(Handler) offerController.createNewOffer);

            app.get("/users",(Handler) userController.getAllUsers);
            app.post("/users",(Handler) userController.createNewUser);
    }

}

