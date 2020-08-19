<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Cafedra</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset>
        <legend>Update discount</legend>
        <form name="discount" action="" method="POST">
            Name:<@spring.formInput "discountForm.name" "" "text"/>
            <br>
            percentageDiscount:<@spring.formInput "discountForm.percentageDiscount" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>

