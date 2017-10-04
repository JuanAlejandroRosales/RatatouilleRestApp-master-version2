package ratatouillerestapp.upc.edu.pe.ui.customer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ratatouillerestapp.upc.edu.pe.R;
import ratatouillerestapp.upc.edu.pe.di.component.ActivityComponent;

import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpView;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseFragment;

/**
 * Created by frank on 03/10/17.
 */

public class CustomerFragment extends BaseFragment implements CustomerMvpView {

    public static final String TAG = "CustomerFragment";

    @Inject
    CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor> mPresenter;

    public static CustomerFragment newInstance() {
        Bundle args = new Bundle();
        CustomerFragment fragment = new CustomerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customer, container, false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            setUnBinder(ButterKnife.bind(this, view));
            mPresenter.onAttach(this);
        }

        return view;
    }

    @Override
    protected void setUp(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @OnClick(R.id.nav_back_btn)
    void onNavBackClick() {
        getBaseActivity().onFragmentDetached(TAG);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }
}

