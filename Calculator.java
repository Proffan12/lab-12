public class Calculator {
    
    // Поля класса
    private String name;
    private double version;
    
    // Конструктор
    public Calculator(String name, double version) {
        this.name = name;
        this.version = version;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Запуск Calculator v1.0 ===");
        
        int a = 10;
        int b = 0;
        int result = a / b;  // Ошибка: деление на ноль! (НЕ ИСПРАВЛЯЕМ)
        
        int[] numbers = new int[5];
        numbers[10] = 100;    // Ошибка: выход за границы массива (НЕ ИСПРАВЛЯЕМ)
        
        System.out.println(result);
        
        // Неиспользуемая переменная (НЕ ИСПРАВЛЯЕМ)
        String unused = "Привет";
        
        // Дополнительная логика
        Calculator calc = new Calculator("SuperCalc", 1.0);
        calc.displayInfo();
        calc.doEverything();
    }
    
    // Метод отображения информации
    public void displayInfo() {
        System.out.println("Калькулятор: " + name);
        System.out.println("Версия: " + version);
    }
    
    // Метод сложения (для примера)
    public int add(int x, int y) {
        return x + y;
    }
    
    // Метод умножения (для примера)
    public int multiply(int x, int y) {
        return x * y;
    }
    
    // Слишком длинная функция (запах кода - НЕ ИСПРАВЛЯЕМ)
    public void doEverything() {
        System.out.println("Начало выполнения doEverything()...");
        
        // Блок 1: инициализация
        int step1 = 1;
        int step2 = 2;
        int step3 = 3;
        
        // Блок 2: вычисления
        int calc1 = step1 + step2;
        int calc2 = calc1 * step3;
        int calc3 = calc2 - step1;
        
        // Блок 3: вывод
        System.out.println("Промежуточный результат: " + calc3);
        
        // Блок 4: дополнительная логика
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация: " + i);
        }
        
        // Блок 5: финализация
        System.out.println("Конец выполнения doEverything()...");
        
        // Ещё больше кода для "запаха"
        String temp1 = "data1";
        String temp2 = "data2";
        String temp3 = temp1 + temp2;
        System.out.println(temp3);
        
        // И ещё...
        boolean flag = true;
        if (flag) {
            System.out.println("Флаг активен");
        }
        
        // Массивы
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        
        // Финальный вывод
        System.out.println("doEverything() завершена");
    }
    
    // Геттеры и сеттеры
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getVersion() {
        return version;
    }
    
    public void setVersion(double version) {
        this.version = version;
    }
}
