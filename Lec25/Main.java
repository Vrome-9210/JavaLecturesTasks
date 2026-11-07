package Lec25;

import org.jetbrains.annotations.Nullable;

import javax.xml.crypto.Data;

public class Main {

    static void main(String[] args) {
//        MyData data = getMyData();
//        if (data == null) {
//            System.out.println("object was null");
//        } else {
//            System.out.println(data.toString());
//        }

//        DataSource repository = new Repository(
//                new CloudDataSource(),
//                new CachedDataSource()
//       );

//       MyData data = repository.getData();
//        System.out.println(data.toString());
//        data = repository.getData();
//        System.out.println(data.toString());

        DataSource<MyData> myDataDataSource = new Repository<>(
                new MyDataCloudDataSource(),
                new CachedDataSource<>()
        );

        DataSource<GeoData> geoDataDataSource = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<>()
        );
        MyData data = myDataDataSource.getData();
//        GeoData geoData = myDataDataSource.getData(); //без понятия почему подсвечивается ошибкой
        System.out.println(data.toString());
//        System.out.println(geoData.toString());

    }

//@NotNull
//    @Nullable
//    private static MyData getMyData(){
//        return null;
//        //return new MyData(1, "1");
//    }
}
