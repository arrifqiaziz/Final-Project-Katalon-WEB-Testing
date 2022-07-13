# Final-Project-Katalon-API-Testing
Final Project for Automated Testing with Katalon Studio in BTDP 2022 with Hacktiv8 as Learning Partner

## Informasi Dasar
Aplikasi Web Testing (https://kotakoki.wijaysali.my.id/) adalah sebuah Final Project dari `BFI Technology Development Program (BTDP) feat Hactiv8` dengan topik `Automated Testing with Katalon`, aplikasi ini terfokus pada bagaimana cara kerja WEB dengan melakukan testing pada semua Fitur WEB, yang dibuat oleh

Nama		                 : `Arrifqi Aziz Ardhiansyah`\
Kode Peserta             : `KSAT006ONL009`\
Dokumentasi setiap Sesi  : [`Repository Bootcamp`](https://github.com/arrifqiaziz/BTDP-Hacktiv8-2022)\
Final Project Website    : [`Repository FP Website`](https://github.com/arrifqiaziz/Final-Project-Katalon-Website-Testing)\
Final Project Mobile     : [`Repository FP Mobile`](https://github.com/arrifqiaziz/Final-Project-Katalon-Mobile-Testing)\
Final Project API        : [`Repository DP API`](https://github.com/arrifqiaziz/Final-Project-Katalon-API-Testing)

---

# Panduan Penggunaan Aplikasi

## Requirement yang harus disipkan sebelum running aplikasi ini adalah :
- Menggunakan `Bahasa Groovy` based `Katalon Studio versi 8.3.5`
- Testing dilakukan pada Website yang disediakan oleh [`Kotakoki`](https://kotakoki.wijaysali.my.id/)
- Testing dilaksanakan dengan Website Browser `Google Chrome versi 103.0.5060.114`

## Document Test Plan
Sebelum pelaksanaan testing, dibuat dokumen Test Plan dan Test Plan Scenario untuk mendokumentasikan perubahan testing dan pedoman dalam melakukan testing\
Yang dapat dilihat di [Document Test Plan](https://github.com/arrifqiaziz/Final-Project-Katalon-WEB-Testing/tree/main/Test%20Plan)

## Ringkasan Hasil Testing
Pada pelaksanaan testing dilakukan testing pada `18 Test Case` dengan hasil :
```
17 Passed
1 Failed
0 Not Executed
```
Sehingga hasil pengujian adalah `94,44% Passed`

## IF ELSE Condition
Pada testing ini juga dimasukan satu test case yang berisi `IF ELSE CONDITION`, yaitu pada `Test Case Add to Cart`
```
if (WebUI.verifyElementClickable(findTestObject('Header/Cart'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page Cart/Cart Checkout to Payment'))
} else {
    WebUI.click(findTestObject('Page Cart/btn Continue Shopping'))
}
```
Dimana, jika Header/Cart dapat di click maka lanjut pada Payment, jika tidak Lanjut pada Continue Shopping

## Data Driven Test
Pada testing ini juga dimasukan satu test case yang berisi `Data Driven Test` yaitu pada `Test Case Login With DDT`\
Dokument DDT dapat diakses pada [`DDT Test File`](https://github.com/arrifqiaziz/Final-Project-Katalon-WEB-Testing/tree/main/DDT%20File)\
Konsep DDT adalah memungkinkan untuk mengisi nilai dari vaiabel dari data yang bersumber pada Data File yaitu 'File DDT Login', tanpa harus di input manual satu-satu\
Data File dapat di generate dari sumber external seperti `DBMS` ataupun file seperti `.xls`, `.csv` pada kasus ini digunakan data dari File Excel `DDT File Web Login Kotakoki.xlsx`, yang memiliki data :

email | password
----- | -----
arrifqi@gmail.com	| Arrifqi1
sumarno@gmail.com	| Sumarno1
rahardja@gmail.com |	Rahardja1
binaraga@gmail.com |	Binaraga1
pranowo@gmail.com	| Pranowo1

Pada `TS Login With DDT` dipanggil `Test Case Login With DDT` lalu dilakukan `Data Binding`, untuk mengkoneksikan antara `Variabel` dalam Test Case dengan `Column` pada Data File.
```
Variable username -> Column email
Variable password -> Column password
```
Sehingga pada pelaksanaan testing, Email dan Password dalam Data File dapat di jalankan secara otomatis


## Report
Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat `Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu
```
TS Add to Cart, Checkout and Payment
TS Login With DDT
TS Menu Bar
TS Newsletter
TS Register and Logout
TS Search Product
```
Untuk lebih memudahkan pengujian dibuat `Test Suites Collection` agar dapat menjalankan beberapa Test Suites secara bersamaan yaitu
```
TST Test All
```
Dan ketika selesai testing, hasil pengujian di Export kedalam bentuk PDF dan HTML adar dapat dilihat lebih rapih di [Report](https://github.com/arrifqiaziz/Final-Project-Katalon-WEB-Testing/tree/main/Report)

## Screenshot
Screenshot Testing hasil testing tidak dimasukan kedalam readme agar rapih\
Jika ingin melihat screenshot silahkan klik di [Screenshot Testing](https://github.com/arrifqiaziz/Final-Project-Katalon-WEB-Testing/tree/main/Screenshot)




# Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)
