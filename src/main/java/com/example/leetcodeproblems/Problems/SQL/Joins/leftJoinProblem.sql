select a.name as Customers from Customers a
left join Orders b on a.id = b.customerId
where customerId is null

#se face joinj de la dreapta la stinga,
# si unde nu este id, se pune null,
# apoi afsam toate ce au null
