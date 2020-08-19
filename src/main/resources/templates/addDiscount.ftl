<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Discount</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Add discount</legend>
        <form name="discount" action="" method="POST">
            Name:<@spring.formInput "discountForm.name" "" "text"/>
            <br>
<#--            Description:<@spring.formInput "discountForm.percentageDiscount" ""/>-->
            Description:<@spring.formInput "discountForm.percentageDiscount" "" "number"/>

            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>