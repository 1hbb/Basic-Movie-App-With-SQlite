public class sqliteDatabase {

    public static void createDatabase() throws Exception {


        Database.setData("CREATE TABLE IF NOT EXISTS user(\n" +
                "    user_id INT AUTO_INCREMENT,\n" +
                "    user_name VARCHAR(50),\n" +
                "    user_mail VARCHAR(50) NOT NULL,\n" +
                "    user_password VARCHAR(50) NOT NULL,\n" +
                "    user_birthday DATE NOT NULL,\n" +
                "    PRIMARY KEY(user_id)\n" +
                "\n" +
                ");");

        Database.setData("CREATE TABLE IF NOT EXISTS type(\n" +
                "    type_id INT,\n" +
                "    type_name VARCHAR(100),\n" +
                "    PRIMARY KEY(type_id)\n" +
                ");");

        Database.setData("CREATE TABLE IF NOT EXISTS program(\n" +
                "    program_id INT AUTO_INCREMENT,\n" +
                "    program_name VARCHAR(100),\n" +
                "    program_type VARCHAR(5),\n" +
                "    program_genre INT,\n" +
                "    program_epiode INT,\n" +
                "    program_duration TIME,\n" +
                "    program_rating DOUBLE,\n" +
                "    PRIMARY KEY(program_id),\n" +
                "    FOREIGN KEY (program_genre) REFERENCES type(type_id)\n" +
                ");");

        Database.setData("CREATE TABLE IF NOT EXISTS user_program(\n" +
                "    watch_date DATETIME,\n" +
                "    watch_duration TIME,\n" +
                "    last_watched_episode INT,\n" +
                "    user_rating DOUBLE,\n" +
                "    program_id INT,\n" +
                "    user_id INT,\n" +
                "    FOREIGN KEY (program_id) REFERENCES program(program_id),\n" +
                "    FOREIGN KEY (user_id) REFERENCES user(user_id)\n" +
                ");");

        Database.setData("CREATE TABLE IF NOT EXISTS program_and_type(\n" +
                "    user_id INT,\n" +
                "    program_id INT,\n" +
                "    type_id INT,\n" +
                "    FOREIGN KEY (program_id) REFERENCES program(program_id),\n" +
                "    FOREIGN KEY (type_id) REFERENCES type(type_id)\n" +
                ");");

        /*Database.setData("INSERT INTO type(type_id, type_name) VALUES (100,'Aksiyon');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (101,'Belgesel');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (102,'Bilim Kurgu ve Fantastik Yapımlar');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (103,'Bilim ve Doğa');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (104,'Çocuk ve Aile');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (105,'Dramalar');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (106,'Gerilim');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (107,'Komedi');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (108,'Korku');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (109,'Romantizm');");*/



    }

}
