module softdrink.small {
    requires softdrink.api;

    provides softdrink.api.SoftDrinkService
            with softdrink.small.SmallSoftDrinkService;
}