--Select
Select ContactName Adi,CompanyName SirketADi,City Sehir from Customers

 Select CompanyName, Address, City from Customers where City = 'London' --'Where' filtreleme için kullanılır.


 --SQL case insensitive dir yani büyük küçük harfe DUYARSIZDIR


 --CategoryId si hem 1 hem de 3 olanlar.
 Select * from Products where CategoryID = 1 or CategoryID=3

-- Select * from Products where CategoryID = 1 or CategoryID>5

select * from Products where CategoryID=1 and UnitPrice>=10

--order by = sırala 
select * from Products order by UnitPrice

--sıralama komutlarının sonunda gizli asc yazıyor. asc=ascending(artan). sonuna desc yazarsak azalana göre sıralar.
select * from Products where categoryID=1 order by UnitPrice desc

--Sorduğumuz itemin adetini sorgulamak için count() kullanırız.
select count(*) Adet from Products

-- bu şekilde kullandığımızda count, her bir grup elemanı için yani her bir kategori için kaç ürün olduğunu gösterir.
select categoryId,count(*) Urun_Adeti from products group by CategoryID

--tabloyu filtrelemek için having count() kullanılır.(ürün adeti 10 dan küçük olanları eledik.)
select categoryId,count(*) Urun_Adeti from products group by CategoryID having count(*)<10

--itemi filtrelemek için where kullanabiliriz fakat ana klasımızdan hemen sonra yazmalıyız.
--sadece fiyatı 20 nin üstüne olan itemleri göster. Ve tablo sadece 10 dan daha az ürüne sahip kategorileri barındırsın.
select categoryId,count(*) Urun_Adeti from products where UnitPrice>20 group by CategoryID having count(*)<10


--iki tabloyu birleştirirken inner join kullanırız. ve neye göre birleşeceklerini de 'on' ile seçeriz.
--İstediğimiz kolonları da select den sonra yazarız.
select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10
--DTO Data Transformation object

-- tabloların içerisinden işlem yaparken daha rahat etmek için kısaltma oluşturmak için tablodan sonra bir boşluk bırakıp kısaltmayı yazarız.
select * from products p inner join [Order Details] od 
on p.ProductID = od.ProductID

--inner join ile ekleyemeyeceğimiz(birbirine uymayan) dataları eklemek için left yazıp soldan ekleme yapabiliriz.
select * from products p left join [Order Details] od 
on p.ProductID = od.ProductID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null --siparişi olmayan müşterileri göster.
