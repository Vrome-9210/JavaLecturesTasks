package Lec25;

import org.jetbrains.annotations.Nullable;

public class MyDataCloudDataSource implements DataSource<MyData> {

    @Override
    public @Nullable MyData getData() {
        return new MyData(1, "description_1");
    }
}
