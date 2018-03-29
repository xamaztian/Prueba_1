package cl.xamaztian.prueba_1;

/**
 * Created by Xamaztian on 27-03-2018.
 */

public class FormValidations {

    static String gender(boolean men, boolean women) {

        if(men)
            return "Masculino";

        if (women)
            return "Femenino";

        return "";
    }

}
