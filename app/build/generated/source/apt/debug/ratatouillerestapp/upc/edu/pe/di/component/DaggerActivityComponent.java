package ratatouillerestapp.upc.edu.pe.di.component;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;
import ratatouillerestapp.upc.edu.pe.data.db.repository.OptionRepository;
import ratatouillerestapp.upc.edu.pe.data.db.repository.OptionRepository_Factory;
import ratatouillerestapp.upc.edu.pe.data.db.repository.QuestionRepository;
import ratatouillerestapp.upc.edu.pe.data.db.repository.QuestionRepository_Factory;
import ratatouillerestapp.upc.edu.pe.data.db.repository.UserRepository;
import ratatouillerestapp.upc.edu.pe.data.db.repository.UserRepository_Factory;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideAboutMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideAboutPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideActivityFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideBlogAdapterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideBlogMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideBlogMvpPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideCustomerMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideCustomerPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideFeedMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideFeedPagerAdapterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideFeedPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideLinearLayoutManagerFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideLoginMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideLoginPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideMainMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideMainPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideOpenSourceAdapterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideOpenSourceMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideOpenSourcePresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideProductMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideProductPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideRateUsPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideRatingDialogMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideReservationMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideReservationPresenterFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideSplashMvpInteractorFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule_ProvideSplashPresenterFactory;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutFragment;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutFragment_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpView;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutPresenter;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerFragment;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerFragment_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerInteractor;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpView;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerPresenter;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedActivity;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedActivity_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedPagerAdapter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogAdapter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogFragment;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogFragment_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceAdapter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceFragment;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceFragment_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourcePresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourcePresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginActivity;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginActivity_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginInteractor;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpView;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginPresenter;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.main.MainActivity;
import ratatouillerestapp.upc.edu.pe.ui.main.MainActivity_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.main.MainInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.MainInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpView;
import ratatouillerestapp.upc.edu.pe.ui.main.MainPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.MainPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RateUsDialog;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RateUsDialog_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpView;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductFragment;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductFragment_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductInteractor;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpView;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductPresenter;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationActivity;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationActivity_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationFragment;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationFragment_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationInteractor;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationMvpView;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationPresenter;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashActivity;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashActivity_MembersInjector;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashInteractor;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpView;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashPresenter;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashPresenter_Factory;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<PreferencesHelper> preferencesHelperProvider;

  private Provider<ApiHelper> apiHelperProvider;

  private Provider<DaoSession> daoSessionProvider;

  private Provider<QuestionRepository> questionRepositoryProvider;

  private Provider<MainInteractor> mainInteractorProvider;

  private Provider<MainMvpInteractor> provideMainMvpInteractorProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<MainPresenter<MainMvpView, MainMvpInteractor>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView, MainMvpInteractor>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<UserRepository> userRepositoryProvider;

  private Provider<LoginInteractor> loginInteractorProvider;

  private Provider<LoginMvpInteractor> provideLoginMvpInteractorProvider;

  private Provider<LoginPresenter<LoginMvpView, LoginMvpInteractor>> loginPresenterProvider;

  private Provider<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>>
      provideLoginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<Context> contextProvider;

  private Provider<OptionRepository> optionRepositoryProvider;

  private Provider<SplashInteractor> splashInteractorProvider;

  private Provider<SplashMvpInteractor> provideSplashMvpInteractorProvider;

  private Provider<SplashPresenter<SplashMvpView, SplashMvpInteractor>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView, SplashMvpInteractor>>
      provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<FeedInteractor> feedInteractorProvider;

  private Provider<FeedMvpInteractor> provideFeedMvpInteractorProvider;

  private Provider<FeedPresenter<FeedMvpView, FeedMvpInteractor>> feedPresenterProvider;

  private Provider<FeedMvpPresenter<FeedMvpView, FeedMvpInteractor>> provideFeedPresenterProvider;

  private Provider<AppCompatActivity> provideActivityProvider;

  private Provider<FeedPagerAdapter> provideFeedPagerAdapterProvider;

  private MembersInjector<FeedActivity> feedActivityMembersInjector;

  private Provider<ReservationInteractor> reservationInteractorProvider;

  private Provider<ReservationMvpInteractor> provideReservationMvpInteractorProvider;

  private Provider<ReservationPresenter<ReservationMvpView, ReservationMvpInteractor>>
      reservationPresenterProvider;

  private Provider<ReservationMvpPresenter<ReservationMvpView, ReservationMvpInteractor>>
      provideReservationPresenterProvider;

  private MembersInjector<ReservationActivity> reservationActivityMembersInjector;

  private Provider<AboutInteractor> aboutInteractorProvider;

  private Provider<AboutMvpInteractor> provideAboutMvpInteractorProvider;

  private Provider<AboutPresenter<AboutMvpView, AboutMvpInteractor>> aboutPresenterProvider;

  private Provider<AboutMvpPresenter<AboutMvpView, AboutMvpInteractor>>
      provideAboutPresenterProvider;

  private MembersInjector<AboutFragment> aboutFragmentMembersInjector;

  private Provider<OpenSourceInteractor> openSourceInteractorProvider;

  private Provider<OpenSourceMvpInteractor> provideOpenSourceMvpInteractorProvider;

  private Provider<OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor>>
      openSourcePresenterProvider;

  private Provider<OpenSourceMvpPresenter<OpenSourceMvpView, OpenSourceMvpInteractor>>
      provideOpenSourcePresenterProvider;

  private Provider<OpenSourceAdapter> provideOpenSourceAdapterProvider;

  private Provider<LinearLayoutManager> provideLinearLayoutManagerProvider;

  private MembersInjector<OpenSourceFragment> openSourceFragmentMembersInjector;

  private Provider<BlogInteractor> blogInteractorProvider;

  private Provider<BlogMvpInteractor> provideBlogMvpInteractorProvider;

  private Provider<BlogPresenter<BlogMvpView, BlogMvpInteractor>> blogPresenterProvider;

  private Provider<BlogMvpPresenter<BlogMvpView, BlogMvpInteractor>>
      provideBlogMvpPresenterProvider;

  private Provider<BlogAdapter> provideBlogAdapterProvider;

  private MembersInjector<BlogFragment> blogFragmentMembersInjector;

  private Provider<RatingDialogInteractor> ratingDialogInteractorProvider;

  private Provider<RatingDialogMvpInteractor> provideRatingDialogMvpInteractorProvider;

  private Provider<RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
      ratingDialogPresenterProvider;

  private Provider<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
      provideRateUsPresenterProvider;

  private MembersInjector<RateUsDialog> rateUsDialogMembersInjector;

  private Provider<CustomerInteractor> customerInteractorProvider;

  private Provider<CustomerMvpInteractor> provideCustomerMvpInteractorProvider;

  private Provider<CustomerPresenter<CustomerMvpView, CustomerMvpInteractor>>
      customerPresenterProvider;

  private Provider<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>>
      provideCustomerPresenterProvider;

  private MembersInjector<CustomerFragment> customerFragmentMembersInjector;

  private Provider<ProductInteractor> productInteractorProvider;

  private Provider<ProductMvpInteractor> provideProductMvpInteractorProvider;

  private Provider<ProductPresenter<ProductMvpView, ProductMvpInteractor>> productPresenterProvider;

  private Provider<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>>
      provideProductPresenterProvider;

  private MembersInjector<ProductFragment> productFragmentMembersInjector;

  private MembersInjector<ReservationFragment> reservationFragmentMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.preferencesHelperProvider =
        new Factory<PreferencesHelper>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public PreferencesHelper get() {
            return Preconditions.checkNotNull(
                applicationComponent.preferencesHelper(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.apiHelperProvider =
        new Factory<ApiHelper>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public ApiHelper get() {
            return Preconditions.checkNotNull(
                applicationComponent.apiHelper(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.daoSessionProvider =
        new Factory<DaoSession>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DaoSession get() {
            return Preconditions.checkNotNull(
                applicationComponent.daoSession(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.questionRepositoryProvider = QuestionRepository_Factory.create(daoSessionProvider);

    this.mainInteractorProvider =
        MainInteractor_Factory.create(
            MembersInjectors.<MainInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider,
            questionRepositoryProvider);

    this.provideMainMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainMvpInteractorFactory.create(
                builder.activityModule, mainInteractorProvider));

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView, MainMvpInteractor>>noOp(),
            provideMainMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.userRepositoryProvider = UserRepository_Factory.create(daoSessionProvider);

    this.loginInteractorProvider =
        LoginInteractor_Factory.create(
            MembersInjectors.<LoginInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider,
            userRepositoryProvider);

    this.provideLoginMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginMvpInteractorFactory.create(
                builder.activityModule, loginInteractorProvider));

    this.loginPresenterProvider =
        LoginPresenter_Factory.create(
            MembersInjectors.<LoginPresenter<LoginMvpView, LoginMvpInteractor>>noOp(),
            provideLoginMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLoginPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginPresenterFactory.create(
                builder.activityModule, loginPresenterProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideLoginPresenterProvider);

    this.contextProvider =
        new Factory<Context>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public Context get() {
            return Preconditions.checkNotNull(
                applicationComponent.context(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.optionRepositoryProvider = OptionRepository_Factory.create(daoSessionProvider);

    this.splashInteractorProvider =
        SplashInteractor_Factory.create(
            MembersInjectors.<SplashInteractor>noOp(),
            contextProvider,
            preferencesHelperProvider,
            apiHelperProvider,
            questionRepositoryProvider,
            optionRepositoryProvider);

    this.provideSplashMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashMvpInteractorFactory.create(
                builder.activityModule, splashInteractorProvider));

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView, SplashMvpInteractor>>noOp(),
            provideSplashMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.feedInteractorProvider =
        FeedInteractor_Factory.create(
            MembersInjectors.<FeedInteractor>noOp(), preferencesHelperProvider, apiHelperProvider);

    this.provideFeedMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideFeedMvpInteractorFactory.create(
                builder.activityModule, feedInteractorProvider));

    this.feedPresenterProvider =
        FeedPresenter_Factory.create(
            MembersInjectors.<FeedPresenter<FeedMvpView, FeedMvpInteractor>>noOp(),
            provideFeedMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideFeedPresenterProvider =
        ActivityModule_ProvideFeedPresenterFactory.create(
            builder.activityModule, feedPresenterProvider);

    this.provideActivityProvider =
        ActivityModule_ProvideActivityFactory.create(builder.activityModule);

    this.provideFeedPagerAdapterProvider =
        ActivityModule_ProvideFeedPagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.feedActivityMembersInjector =
        FeedActivity_MembersInjector.create(
            provideFeedPresenterProvider, provideFeedPagerAdapterProvider);

    this.reservationInteractorProvider =
        ReservationInteractor_Factory.create(
            MembersInjectors.<ReservationInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider,
            userRepositoryProvider);

    this.provideReservationMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideReservationMvpInteractorFactory.create(
                builder.activityModule, reservationInteractorProvider));

    this.reservationPresenterProvider =
        ReservationPresenter_Factory.create(
            MembersInjectors
                .<ReservationPresenter<ReservationMvpView, ReservationMvpInteractor>>noOp(),
            provideReservationMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideReservationPresenterProvider =
        ActivityModule_ProvideReservationPresenterFactory.create(
            builder.activityModule, reservationPresenterProvider);

    this.reservationActivityMembersInjector =
        ReservationActivity_MembersInjector.create(
            provideReservationPresenterProvider, provideFeedPagerAdapterProvider);

    this.aboutInteractorProvider =
        AboutInteractor_Factory.create(
            MembersInjectors.<AboutInteractor>noOp(), preferencesHelperProvider, apiHelperProvider);

    this.provideAboutMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideAboutMvpInteractorFactory.create(
                builder.activityModule, aboutInteractorProvider));

    this.aboutPresenterProvider =
        AboutPresenter_Factory.create(
            MembersInjectors.<AboutPresenter<AboutMvpView, AboutMvpInteractor>>noOp(),
            provideAboutMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideAboutPresenterProvider =
        ActivityModule_ProvideAboutPresenterFactory.create(
            builder.activityModule, aboutPresenterProvider);

    this.aboutFragmentMembersInjector =
        AboutFragment_MembersInjector.create(provideAboutPresenterProvider);

    this.openSourceInteractorProvider =
        OpenSourceInteractor_Factory.create(
            MembersInjectors.<OpenSourceInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider);

    this.provideOpenSourceMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideOpenSourceMvpInteractorFactory.create(
                builder.activityModule, openSourceInteractorProvider));

    this.openSourcePresenterProvider =
        OpenSourcePresenter_Factory.create(
            MembersInjectors
                .<OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor>>noOp(),
            provideOpenSourceMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOpenSourcePresenterProvider =
        ActivityModule_ProvideOpenSourcePresenterFactory.create(
            builder.activityModule, openSourcePresenterProvider);

    this.provideOpenSourceAdapterProvider =
        ActivityModule_ProvideOpenSourceAdapterFactory.create(builder.activityModule);

    this.provideLinearLayoutManagerProvider =
        ActivityModule_ProvideLinearLayoutManagerFactory.create(
            builder.activityModule, provideActivityProvider);

    this.openSourceFragmentMembersInjector =
        OpenSourceFragment_MembersInjector.create(
            provideOpenSourcePresenterProvider,
            provideOpenSourceAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.blogInteractorProvider =
        BlogInteractor_Factory.create(
            MembersInjectors.<BlogInteractor>noOp(), preferencesHelperProvider, apiHelperProvider);

    this.provideBlogMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideBlogMvpInteractorFactory.create(
                builder.activityModule, blogInteractorProvider));

    this.blogPresenterProvider =
        BlogPresenter_Factory.create(
            MembersInjectors.<BlogPresenter<BlogMvpView, BlogMvpInteractor>>noOp(),
            provideBlogMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideBlogMvpPresenterProvider =
        ActivityModule_ProvideBlogMvpPresenterFactory.create(
            builder.activityModule, blogPresenterProvider);

    this.provideBlogAdapterProvider =
        ActivityModule_ProvideBlogAdapterFactory.create(builder.activityModule);

    this.blogFragmentMembersInjector =
        BlogFragment_MembersInjector.create(
            provideBlogMvpPresenterProvider,
            provideBlogAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.ratingDialogInteractorProvider =
        RatingDialogInteractor_Factory.create(
            MembersInjectors.<RatingDialogInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider);

    this.provideRatingDialogMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideRatingDialogMvpInteractorFactory.create(
                builder.activityModule, ratingDialogInteractorProvider));

    this.ratingDialogPresenterProvider =
        RatingDialogPresenter_Factory.create(
            MembersInjectors
                .<RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>noOp(),
            provideRatingDialogMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRateUsPresenterProvider =
        ActivityModule_ProvideRateUsPresenterFactory.create(
            builder.activityModule, ratingDialogPresenterProvider);

    this.rateUsDialogMembersInjector =
        RateUsDialog_MembersInjector.create(provideRateUsPresenterProvider);

    this.customerInteractorProvider =
        CustomerInteractor_Factory.create(
            MembersInjectors.<CustomerInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider);

    this.provideCustomerMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideCustomerMvpInteractorFactory.create(
                builder.activityModule, customerInteractorProvider));

    this.customerPresenterProvider =
        CustomerPresenter_Factory.create(
            MembersInjectors.<CustomerPresenter<CustomerMvpView, CustomerMvpInteractor>>noOp(),
            provideCustomerMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideCustomerPresenterProvider =
        ActivityModule_ProvideCustomerPresenterFactory.create(
            builder.activityModule, customerPresenterProvider);

    this.customerFragmentMembersInjector =
        CustomerFragment_MembersInjector.create(provideCustomerPresenterProvider);

    this.productInteractorProvider =
        ProductInteractor_Factory.create(
            MembersInjectors.<ProductInteractor>noOp(),
            preferencesHelperProvider,
            apiHelperProvider);

    this.provideProductMvpInteractorProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideProductMvpInteractorFactory.create(
                builder.activityModule, productInteractorProvider));

    this.productPresenterProvider =
        ProductPresenter_Factory.create(
            MembersInjectors.<ProductPresenter<ProductMvpView, ProductMvpInteractor>>noOp(),
            provideProductMvpInteractorProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideProductPresenterProvider =
        ActivityModule_ProvideProductPresenterFactory.create(
            builder.activityModule, productPresenterProvider);

    this.productFragmentMembersInjector =
        ProductFragment_MembersInjector.create(provideProductPresenterProvider);

    this.reservationFragmentMembersInjector =
        ReservationFragment_MembersInjector.create(provideReservationPresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(FeedActivity activity) {
    feedActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(ReservationActivity activity) {
    reservationActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutFragment fragment) {
    aboutFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenSourceFragment fragment) {
    openSourceFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(BlogFragment fragment) {
    blogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(RateUsDialog dialog) {
    rateUsDialogMembersInjector.injectMembers(dialog);
  }

  @Override
  public void inject(CustomerFragment fragment) {
    customerFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(ProductFragment fragment) {
    productFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(ReservationFragment fragment) {
    reservationFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
