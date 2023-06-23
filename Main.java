import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SecurityException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        SignUp signUp = new SignUp(username, password);
        if (signUp.getUser_Name().equals(username) && signUp.getPass_Word().equals(password)) {
            System.out.println("Login successful!");
            userMenu(scanner);
        } else if (signUp.getAUser_Name().equals(username) && signUp.getAPass_Word().equals(password)) {
            System.out.println("Login successful!");
            readCosmeticsList();
        } else {
            System.out.println("Invalid username or password. Login failed.");
            throw new SecurityException("Invalid username or password. Login failed.");
        }
    }

    private static void userMenu(Scanner scanner) {
        List<AgentCosList> cosmeticsList = new ArrayList<>();
        boolean exitMenu = false;

        while (!exitMenu) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add a new cosmetic");
            System.out.println("2. Show cosmetic list");
            System.out.println("3. Remove a cosmetic");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewCosmetics(scanner, cosmeticsList);
                    break;
                case 2:
                    showCosmeticsList();
                    break;
                case 3:
                    removeCosmetics(scanner);
                    break;
                case 4:
                    exitMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        writeCosmeticsList(cosmeticsList);
    }

    private static void addNewCosmetics(Scanner scanner, List<AgentCosList> cosmeticsList){
        while (true) {
            System.out.println("Enter medicine name:");
            String medicineName = scanner.nextLine();

            if (medicineName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter generic name:");
            String genericName = scanner.nextLine();

            System.out.println("Enter company name:");
            String companyName = scanner.nextLine();

            System.out.println("Enter expiry date:");
            String expiryDate = scanner.nextLine();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();

            System.out.println("Enter total quantity:");
            int totalQuantity = scanner.nextInt();
            scanner.nextLine();

            AgentCosList medicine = new AgentCosList(medicineName, genericName, companyName, expiryDate, price, totalQuantity);
            cosmeticsList.add(medicine);

            System.out.println("Cosmetic added successfully.");
            System.out.println("Write exit for stop input.");
        }
        writeCosmeticsList(cosmeticsList);
    }
            private static void showCosmeticsList() {
        try {
            FileReader fileReader = new FileReader("cosmetics_list.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    private static void removeCosmetics(Scanner scanner) {
        try {
            System.out.println("Enter medicine name to remove:");
            String CosmeticsName = scanner.nextLine();

            FileReader fileReader = new FileReader("cosmetics_list.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<>();
            String line;
            boolean found = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(CosmeticsName)) {
                    found = true;
                    continue;
                }
                lines.add(line);
            }

            bufferedReader.close();

            if (!found) {
                System.out.println("Cosmetic not found in the list.");
                return;
            }

            FileWriter fileWriter = new FileWriter("cosmetics_list.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String updatedLine : lines) {
                bufferedWriter.write(updatedLine);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Cosmetic removed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while removing the cosmetic: " + e.getMessage());
        }
    }

    private static void writeCosmeticsList(List<AgentCosList> CosmeticsList) {
        try {
            FileWriter fileWriter = new FileWriter("medicine_list.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            AgentCosList medicine = CosmeticsList.get(CosmeticsList.size() - 1);

            bufferedWriter.write(medicine.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
            System.out.println("Cosmetic added successfully. Medicine list updated.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private static void readCosmeticsList() {
        try {
            FileReader fileReader = new FileReader("cosmetics_list.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}