package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0 ;i < patientsTemperatures.length; i++){
            patientsTemperatures[i] = (float) (Math.random() * 8) + 32;
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        StringBuilder patients = new StringBuilder();
        int count = 0;
        int healthy = 1;
        float temp = 0;
        double middleTemp;

        for (int i = 0 ; i < temperatureData.length ; i++){
            patients.append(temperatureData[i]).append(" ");
            temp+=temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9){
                healthy++;
            }
            count++;
        }
        double d = temp/count;
        middleTemp = Math.rint(100.0*d)/100.0;

        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String report =
            "Температуры пациентов: " + patients.toString().trim() +
            "\nСредняя температура: " + middleTemp +
            "\nКоличество здоровых: " + healthy;

        return report;
    }
}
