package ratatouillerestapp.upc.edu.pe;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MvpApp_MembersInjector implements MembersInjector<MvpApp> {
  private final Provider<CalligraphyConfig> mCalligraphyConfigProvider;

  public MvpApp_MembersInjector(Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    assert mCalligraphyConfigProvider != null;
    this.mCalligraphyConfigProvider = mCalligraphyConfigProvider;
  }

  public static MembersInjector<MvpApp> create(
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    return new MvpApp_MembersInjector(mCalligraphyConfigProvider);
  }

  @Override
  public void injectMembers(MvpApp instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }

  public static void injectMCalligraphyConfig(
      MvpApp instance, Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }
}
