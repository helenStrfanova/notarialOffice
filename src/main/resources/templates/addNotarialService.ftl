<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add notarial service</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Add notarial service</legend>
        <form name="notarialService" action="" method="POST">
            Name:<@spring.formInput "notarialServiceForm.name" "" "text"/>
            <br>
            <#--            Description:<@spring.formInput "discountForm.percentageDiscount" ""/>-->
            Description:<@spring.formInput "notarialServiceForm.description" "" "text"/>

            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>