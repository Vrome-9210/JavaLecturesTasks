package Lec24.Workers;

public class SortWorkers {

    public String sortByLevel(WorkerType type) {
        String ret;
        switch (type) {
            case MIDL:
                ret = "Мидлу предлагаем зарплату 195000";
                break;
            case SENIOR:
                ret = "Сеньёру предлагаем зарплату 325000";
                break;
            default:
                ret = type + " отсеиваем";
        }
        return ret;
    }
}
