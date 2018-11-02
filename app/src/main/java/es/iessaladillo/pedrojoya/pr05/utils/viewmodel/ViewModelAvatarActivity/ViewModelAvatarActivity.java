package es.iessaladillo.pedrojoya.pr05.utils.viewmodel.ViewModelAvatarActivity;

import androidx.lifecycle.ViewModel;
import es.iessaladillo.pedrojoya.pr05.data.local.Database;
import es.iessaladillo.pedrojoya.pr05.data.local.model.Avatar;


@SuppressWarnings("WeakerAccess")
public class ViewModelAvatarActivity extends ViewModel {
    private Database database = Database.getInstance();
    private Avatar avatar;


    public Avatar getAvatar() {
        if (avatar == null) {
            avatar = database.getDefaultAvatar();
        }

        return avatar;
    }


    public void changeAvatar(long id) {

        avatar = database.queryAvatar(id);


    }

}
