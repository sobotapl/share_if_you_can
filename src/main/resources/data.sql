
INSERT INTO `categories` (name) VALUES
    ('Ubrania'),
    ('Zabawki'),
    ('Sprzet'),
    ('Elektornika'),
    ('Ksiazka'),
    ('Meble');

INSERT INTO `institutions` (name, description) VALUES
    ('Fundacja "Dbam o Zdrowie"', 'Cel i misja: Pomoc dzieciom z ubogich rodzin'),
    ('Fundacja "Nowy dom"', 'Cel i misja: Pomoc na nowy start'),
    ('Fundacja "A kogo"', 'Cel i misja: Pomoc wybudzaniu dzieci ze śpiączki.'),
    ('Fundacja “Dla dzieci"', 'Cel i misja: Pomoc osobom znajdującym się w trudnej sytuacji życiowej.'),
    ('Fundacja “Bez domu”', 'Cel i misja: Pomoc dla osób nie posiadających miejsca zamieszkania');

INSERT INTO `donations` (quantity, street, city, zip_code, pick_up_date, pick_up_time, pick_up_comment) VALUES
    ( 2, 'Poznanska', 'Krakow', '30-638', '2023.04.04', '08:00:00', 'Nowe ubrania, nieuzywane' ),
    (12, 'Krakowska', 'Debica', '20-638', '2023.05.04', '13:00:00','Wszystko OK' ),
    (3, 'Nowa', 'Rzeszow', '13-634', '2023.04.14', '13:00:00', 'OK' ),
    (7, 'Zwierzyniecka', 'Wroclaw', '32-622', '2023.04.22', '13:00:00', 'Nowe ubrania, nieuzywane' ),
    (12, 'Marmonska', 'Krakow', '10-111', '2023.09.23', '13:30:00', 'Nowe ubrania, nieuzywane' ),
    (12, 'Dluga', 'Wieliczka', '30-645', '2023.06.24', '15:00:00', 'Dziekuje' ),
    (9, 'Szeroka', 'Szczecin', '11-654', '2023.04.14', '17:00:00', 'Wszystko bez problemu' ),
    (3,  'Wielka', 'Katowice', '34-637', '2023.04.16', '18:00:00', 'Nowe ubrania, nieuzywane' ),
    (3, 'Dunajewskiego', 'Poznan', '22-666', '2023.07.23', '19:00:00', 'Nowe ubrania, nieuzywane' ),
    (4, 'Mogilsa', 'Krakow', '10-640', '2023.04.29', '13:00:00', 'Nowe ubrania, nieuzywane' );

INSERT INTO `donations_categories` (donation_id, categories_id) VALUES
    (1,1),
    (1,2),
    (2,1);