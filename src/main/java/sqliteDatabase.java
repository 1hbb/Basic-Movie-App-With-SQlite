public class sqliteDatabase {

    public static void createDatabase() throws Exception {


        Database.setData("DROP TABLE IF EXISTS program");
        Database.setData("DROP TABLE IF EXISTS type");

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
                "    program_type VARCHAR(30),\n" +
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

        Database.setData("INSERT INTO type(type_id, type_name) VALUES (100,'Aksiyon');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (101,'Belgesel');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (102,'Bilim Kurgu ve Fantastik Yapımlar');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (103,'Bilim ve Doğa');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (104,'Çocuk ve Aile');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (105,'Dramalar');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (106,'Gerilim');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (107,'Komedi');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (108,'Korku');");
        Database.setData("INSERT INTO type(type_id, type_name) VALUES (109,'Romantizm');");

        //Database.setData("DELETE FROM program");


        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Recep İvedik 6','Film',100,1,'1:59:10',2.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Assassıns Creed','Film',100,1,'1:59:10',5.7);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Alaca Karanlık','Film',100,1,'1:59:10',5.2);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Yüzüklerin Efendisi İki Kule','Film',102,1,'1:59:10',8.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Maske','Film',102,1,'1:59:10',6.9);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Kara Şövalye','Film',102,1,'1:59:10',9.0);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Sherlock Holmes','Film',100,1,'1:59:10',7.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Yüzüklerin Efendisi kralın Dönüşü','Film',102,1,'1:59:10',8.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Transformers Kayıp Çağ','Film',102,1,'1:59:10',5.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Başlangıç','Film',100,1,'1:59:10',8.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Interstellar','Film',100,1,'1:59:10',8.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Harry Potter Ölüm Yadigarları','Film',102,1,'1:59:10',8.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Jurassic World','Film',100,1,'1:59:10',7.0);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Fantastik Canavarlar','Film',100,1,'1:59:10',6.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Ninja Kaplumbağalar','Film',100,1,'1:59:10',5.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Kuşlarla Dans','Film',101,1,'1:59:10',6.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Mission Blue','Film',101,1,'1:59:10',2.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Mercan Peşinde','Film',101,1,'1:59:10',6.5);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Dream Big','Film',100,1,'1:59:10',6.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Aydaki Son Adam','Film',101,1,'1:59:10',7.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Plastik Okyanus','Film',101,1,'1:59:10',6.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Rakamlarla Tahmin','Film',101,1,'1:59:10',5.7);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Ben Efsaneyim','Film',102,1,'1:59:10',8.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Arif V 216','Film',107,1,'1:59:10',7.2);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('PK','Film',102,1,'1:59:10',8.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Örümcek Adam','Film',102,1,'1:59:10',7.3);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Jurassıc Park','Film',102,1,'1:59:10',8.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Frankestein','Film',102,1,'1:59:10',7.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Gezegenimiz','Film',101,1,'1:59:10',8.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('72 sevimli hayvan','Film',101,1,'1:59:10',5.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Kuşçular','Film',101,1,'1:59:10',6.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Marsta Keşif','Film',101,1,'1:59:10',5.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Pandemic','Film',101,1,'1:59:10',5.9);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Pokemon','Film',104,1,'1:59:10',6.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Şirinler','Film',104,1,'1:59:10',7.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Charlienin Çikolata Fabrikası','Film',104,1,'1:59:10',6.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Alvin ve Sincaplar','Film',104,1,'1:59:10',5.2);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Scooby-Doo','Film',104,1,'1:59:10',5.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Kung Fu Panda','Film',104,1,'1:59:10',7.5);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Mr. Bean Tatilde','Film',104,1,'1:59:10',6.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Shrek','Film',104,1,'1:59:10',7.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Mega Zeka','Film',104,1,'1:59:10',7.2);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Bizi Hatırla','Film',105,1,'1:59:10',7.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Delibal','Film',105,1,'1:59:10',6.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Kardeşim Benim','Film',105,1,'1:59:10',5.9);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Dangal','Film',105,1,'1:59:10',8.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Yerçekimi','Film',102,1,'1:59:10',7.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Jaws','Film',106,1,'1:59:10',8.0);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Da Vinci Şifresi','Film',106,1,'1:59:10',6.6);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Marwel Iron Fist','Dizi',100,10,'1:59:10',6.5);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Ejderhalar','Dizi',104,10,'59:00',8.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Diriliş Ertuğrul','Dizi',100,10,'59:00',8.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Trol Avcıları: Arcadia Hikayeleri','Dizi',104,10,'59:00',7.5);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('How I met your mother','Dizi',109,10,'59:00',8.3);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Leyla ile Mecnun','Dizi',109,10,'59:00',7.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Beni Böyle Sev','Dizi',105,10,'59:00',5.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Patron Bebek Yine İş başında','Dizi',104,10,'59:00',6.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Atiye','Dizi',100,10,'59:00',6.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Maşa ve Koca Ayı','Dizi',104,10,'59:00',6.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Sünger Bob','Dizi',104,10,'59:00',7.0);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Stranger Tings','Dizi',100,10,'59:00',6.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('The Originals','Dizi',105,10,'59:00',8.2);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Angry Birds','Dizi',104,10,'59:00',6.4);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Criminal','Dizi',106,10,'59:00',8.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Beyblade','Dizi',104,10,'59:00',6.8);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Sonic X','Dizi',100,10,'59:00',6.1);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('Kung Fu Panda Muhteşem Sırlar','Dizi',100,10,'59:00',7.2);");

        Database.setData("INSERT INTO program(program_name,program_type,program_genre,program_epiode,program_duration,program_rating)\n" +
                "VALUES('The Blacklist','Dizi',100,10,'59:00',8.0);");

        Database.setData("INSERT INTO program(program_name,program_type)\n" +
                "VALUES('Dünyanın En Sıra Dışı Evleri','Reality Program');");


        Database.setData("INSERT INTO program(program_name,program_type)\n" +
                "VALUES('Car Masters','Reality Program');");

        Database.setData("INSERT INTO program(program_name,program_type)\n" +
                "VALUES('Büyük Tasarımlar','Reality Program');");

        Database.setData("INSERT INTO program(program_name,program_type)\n" +
                "VALUES('Basketball or Nothing','Reality Program Tv Show');");

        Database.setData("INSERT INTO program(program_name,program_type)\n" +
                "VALUES('The Big Family Cooking','Reality Program Tv Show');");

        Database.setData("INSERT INTO program(program_name,program_type)\n" +
                "VALUES('Sıradışı Kulübeler','Reality Program Tv Show');");





    }

}
