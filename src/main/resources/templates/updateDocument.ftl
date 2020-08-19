<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Document</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset style="display: inline-block">
        <legend>Add document</legend>
        <form name="document" action="" method="POST">
            Notarial Service:<@spring.formSingleSelect  "documentForm.notarialService" , movs, ""/> <br>
            Notarial Service Price:<@spring.formInput "documentForm.notarialServicePrice" "" "number"/> <br>
            Address:<@spring.formInput "documentForm.commission" "" "number"/> <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>
</body>
</html>