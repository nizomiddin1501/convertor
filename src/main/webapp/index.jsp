<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Currency Converter</h2>
    <form action="/convert" method="post">
        <div class="form-group">
            <label for="amount">Amount:</label>
            <input type="number" class="form-control" id="amount" name="amount" step="0.01" required>
        </div>
        <div class="form-group">
            <label for="fromCurrency">From Currency :</label>
            <select class="form-control" id="fromCurrency" name="fromCurrency" required>
                <option value="USD">USA Dollar</option>
                <option value="EUR">EUR</option>
                <option value="UZS">Uzbek So'm</option>
                <option value="TRY">Turkish Lira</option>
                <option value="TJS">Tajik Somon</option>
                <option value="RUB">Russian Ruble</option>
                <option value="KGS">Kyrgyzstan som</option>
                <option value="KZT">Kazakhstan tenge</option>

            </select>
        </div>
        <div class="form-group">
            <label for="toCurrency">To Currency :</label>
            <select class="form-control" id="toCurrency" name="toCurrency" required>
                <option value="USD">USA Dollar</option>
                <option value="EUR">EUR</option>
                <option value="UZS">Uzbek So'm</option>
                <option value="TRY">Turkish Lira</option>
                <option value="TJS">Tajikistan Somon</option>
                <option value="RUB">Russian Ruble</option>
                <option value="KGS">Kyrgyzstan som</option>
                <option value="KZT">Kazakhstan tenge</option>

            </select>
        </div>
        <button type="submit" class="btn btn-primary">Convert</button>
    </form>
</div>
</body>
</html>
