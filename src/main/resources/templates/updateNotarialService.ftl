<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update notarial services</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Update discount</legend>
        <form name="notarialService" action="" method="POST">
            Name:<@spring.formInput "notarialServiceForm.name" "" "text"/>
            <br>
            Description:<@spring.formInput "notarialServiceForm.description" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>

