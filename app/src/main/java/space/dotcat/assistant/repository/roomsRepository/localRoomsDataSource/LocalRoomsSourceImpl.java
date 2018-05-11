package space.dotcat.assistant.repository.roomsRepository.localRoomsDataSource;


import android.support.annotation.NonNull;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import space.dotcat.assistant.content.Room;

public class LocalRoomsSourceImpl implements LocalRoomsSource {

    private RoomsDao mRoomsDao;

    public LocalRoomsSourceImpl(@NonNull RoomsDao roomsDao) {
        mRoomsDao = roomsDao;
    }

    @Override
    public Flowable<List<Room>> getRooms() {
        return mRoomsDao.getRooms();
    }

    @Override
    public void addRoomsSync(List<Room> rooms) {
        mRoomsDao.addRoomsSync(rooms);
    }

    @Override
    public void deleteRoomsSync() {
        mRoomsDao.deleteRoomsSync();
    }
}